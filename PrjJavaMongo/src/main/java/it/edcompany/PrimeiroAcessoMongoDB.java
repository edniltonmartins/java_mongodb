package it.edcompany;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class PrimeiroAcessoMongoDB {
	
	public static void main(String[] args){
		MongoClient mongoClient = new MongoClient();
		MongoDatabase database = mongoClient.getDatabase("cardapio");
		MongoCollection<Document> cardapios = database.getCollection("cardapios");
		Document cardapio = cardapios.find().first();
		System.out.println(cardapio);
		
		/*Document cardapioNovo = new Document().append("nome", "Cardapio - Quarta-Feira").append("dataCriacao", "02/07/2016").append("pratos", Arrays.asList(new Document().append("id", "1").append("nome", "Caldo verde").append("preço", "15,90").append("dataCriacao", "02/07/2016"),
				new Document().append("id", "1").append("nome", "Canja").append("preço", "15,90").append("dataCriacao", "02/07/2016"),
				new Document().append("id", "1").append("nome", "Sopa de Ervilha").append("preço", "15,90").append("dataCriacao", "02/07/2016"),
				new Document().append("id", "1").append("nome", "Vaca atolada").append("preço", "15,90").append("dataCriacao", "02/07/2016")));
		
		cardapios.insertOne(cardapioNovo);*/
		
		//cardapios.updateOne(Filters.eq("nome", "Cardapio - Quarta-Feira"), new Document("$set",new Document("nome", "Cardapio - Quinta-Feira")));
		
		cardapios.deleteOne(Filters.eq("nome", "Cardapio - Quinta-Feira"));
		
		mongoClient.close();
	}

}
