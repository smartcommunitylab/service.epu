package it.smartcampuslab.epu.storage;

import it.smartcampuslab.epu.model.PDFData;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class PraticaStorage {

	@Autowired
	MongoTemplate template;

	public boolean store(PraticaData pd) {
		Query query = new Query().addCriteria(new Criteria("idDomanda").is(pd.getIdDomanda()));

		if (template.findOne(query, PraticaData.class, "epu") != null) {
			return false;
		}
		
		Update u = new Update();
		
		template.save(pd, "epu");
		
		return true;
	}
	
	public boolean delete(PraticaData pd) {
		Query query = new Query().addCriteria(new Criteria("idDomanda").is(pd.getIdDomanda()));
		
		Update u = new Update();
		u.set("deleted", true);		
		
		template.updateFirst(query, u, "epu");
		
		return true;
	}

	public boolean updateField(Long idDomanda, String field, Object value) {
		Query query = new Query().addCriteria(new Criteria("idDomanda").is(idDomanda));

		PraticaData pd = template.findOne(query, PraticaData.class, "epu");
		if (pd == null) {
			return false;
		}
		
		Update u = new Update();
		u.set(field, value);		
		
		template.updateFirst(query, u, "epu");
		
		return true;
	}	
	
	public boolean updatePagamento(PagamentoInfo info) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(info.getIdDomanda()));

		pd = template.findOne(query, PraticaData.class, "epu");

		if (pd == null) {
			return false;
		}

		pd.setIdentificativo(info.getIdentificativo());
		pd.setGiornoEmissione(info.getGiornoEmissione());
		pd.setOraEmissione(info.getOraEmissione());
		pd.setStatus(Status.PAGATA);
		
		Update u = new Update();
		u.set("identificativo", info.getIdentificativo());
		u.set("giornoEmissione", info.getGiornoEmissione());
		u.set("oraEmissione", info.getOraEmissione());
		u.set("esenzione", info.getEsenzione());
		u.set("motivo", info.getMotivo());
		u.set("status", "PAGATA");
		
		template.updateFirst(query, u, "epu");
		
		return true;
	}

	public boolean updateProtocollo(ProtocolloInfo info) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(info.getIdDomanda()));

		pd = template.findOne(query, PraticaData.class, "epu");

		if (pd == null) {
			return false;
		}

		Update u = new Update();
		u.set("p3Hash", info.getHash());
		u.set("p3Id", info.getId());

		template.updateFirst(query, u, "epu");
		
		return true;
	}
	
	public boolean updateAutocertificazione(PDFData pdfData) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(pdfData.getDomandaInfo().getIdDomanda()));

		pd = template.findOne(query, PraticaData.class, "epu");

		if (pd == null) {
			return false;
		}

		Update u = new Update();
		
		Map<String, Object> autoMap = new TreeMap<String, Object>();
		ObjectMapper mapper = new ObjectMapper();
		autoMap = (Map<String, Object>)mapper.convertValue(pdfData.getAutocertificazione(), Map.class);		
		u.set("autocertificazione", autoMap);

		template.updateFirst(query, u, "epu");
		
		return true;
	}	
	
	public boolean updateEPUTime(long idDomanda) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(idDomanda));

		pd = template.findOne(query, PraticaData.class, "epu");

		if (pd == null) {
			return false;
		}
		
		Update u = new Update();
		u.set("epuTime", System.currentTimeMillis());

		template.updateFirst(query, u, "epu");
		
		return true;
	}	
	

	public PraticaData getPratica(Long id) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(id));

		pd = template.findOne(query, PraticaData.class, "epu");

		return pd;
	}
	
	public List<PraticaData> getPratiche(String userIdentity, boolean all) {
		List<PraticaData> result;

		Query query = new Query();
		
		if (userIdentity != null) {
			query = query.addCriteria(new Criteria("userIdentity").is(userIdentity));
		}
		if (!all) {
			query.addCriteria(new Criteria("deleted").ne(true));
		}

		result = template.find(query, PraticaData.class, "epu");

		return result;
	}	

	public PraticaData updateStatus(Long id, Status status) {
		PraticaData pd;

		Query query = new Query().addCriteria(new Criteria("idDomanda").is(id));

		pd = template.findOne(query, PraticaData.class, "epu");

		Update u = new Update();
		u.set("status", status);
		u.set("data", System.currentTimeMillis());
		
		if (pd != null) {
			pd.setStatus(status);
			pd.setData(System.currentTimeMillis());
		}
		
		template.updateFirst(query, u, "epu");
		
		return pd;
	}

}
