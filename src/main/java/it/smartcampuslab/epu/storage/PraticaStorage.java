package it.smartcampuslab.epu.storage;

import it.smartcampuslab.epu.model.DomandaInfo;

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
	public boolean store(DomandaInfo info) {
		PraticaData pd = new PraticaData();
//		pd.setId(info.getId() + "_" + info.getUserIdentity());
		pd.setEpuDomandaId(info.getId());
		pd.setUserIdentity(info.getUserIdentity());
		
		Query query = new Query().addCriteria(new Criteria("epuDomandaId").is(info.getId()));
		
		if (template.findOne(query, PraticaData.class, "epu") != null) {
			return false;
		}
		template.save(pd, "epu");
		return true;
	}
	
	public boolean updatePagamento(PagamentoInfo info) {
		PraticaData pd;
		
		Query query = new Query().addCriteria(new Criteria("epuDomandaId").is(info.getId()));
		
		pd = template.findOne(query, PraticaData.class, "epu");
		
		if (pd == null) {
			return false;
		}
		
		pd.setMarcaDaBollo(info.getMarcaDaBollo());
		template.save(pd, "epu");
		return true;
	}
	
	public boolean updateProtocollo(ProtocolloInfo info) {
		PraticaData pd;
		
		Query query = new Query().addCriteria(new Criteria("epuDomandaId").is(info.getId()));
		
		pd = template.findOne(query, PraticaData.class, "epu");
		
		if (pd == null) {
			return false;
		}
		
		pd.setP3Id(info.getProtocollo());
		Update u = new Update();
		
		template.save(pd, "epu");
		return true;
	}	
	
	
}
