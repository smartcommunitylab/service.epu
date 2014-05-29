package it.smartcampuslab.epu.storage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


public class PraticaStorage {

	@Autowired
	MongoTemplate template;
	
//	public PraticaStorage() throws UnknownHostException, MongoException {
//		Mongo mongo = new Mongo();
//		DB db = mongo.getDB("myweb");
//		collection = db.getCollection("epu");
//	}
//	
	public boolean store(PraticaData pd) {
//		PraticaData pd = new PraticaData();
//		pd.setId(info.getId() + "_" + info.getUserIdentity());
//		pd.setEpuDomandaId(info.getId());
//		pd.setUserIdentity(info.getUserIdentity());
		
		Query query = new Query().addCriteria(new Criteria("id").is(pd.getId()));
		
		if (template.findOne(query, PraticaData.class, "epu") != null) {
			return false;
		}
		template.save(pd, "epu");
		return true;
	}
	
	public boolean updatePagamento(PagamentoInfo info) {
		PraticaData pd;
		
		Query query = new Query().addCriteria(new Criteria("id").is(info.getId()));
		
		pd = template.findOne(query, PraticaData.class, "epu");
		
		if (pd == null) {
			return false;
		}
		
		pd.setIdPagamento(info.getIdPagamento());
		pd.setImportoPagamento(info.getImportoPagamento());
		pd.setModalitaPagamento(info.getModalitaPagamento());
		template.save(pd, "epu");
		return true;
	}
	
	public boolean updateProtocollo(ProtocolloInfo info) {
		PraticaData pd;
		
		Query query = new Query().addCriteria(new Criteria("id").is(info.getId()));
		
		pd = template.findOne(query, PraticaData.class, "epu");
		
		if (pd == null) {
			return false;
		}
		
		pd.setP3Id(info.getProtocollo());
		Update u = new Update();
		
		template.save(pd, "epu");
		return true;
	}	
	
	public boolean updateStatus(Long id, Status status) {
		PraticaData pd;
		
		Query query = new Query().addCriteria(new Criteria("id").is(id));
		
		pd = template.findOne(query, PraticaData.class, "epu");
		
		if (pd == null) {
			return false;
		}
		
		pd.setStatus(status);
		pd.setData(System.currentTimeMillis());
		Update u = new Update();
		
		template.save(pd, "epu");
		return true;
	}
	
	
}
