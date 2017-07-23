package it.edcompany;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class PrimeiroAcessoMongoDB {
	
	public static void main(String[] args){
		MongoClient mongoClient = new MongoClient();
		MongoDatabase database = mongoClient.getDatabase("cardapio");
		MongoCollection<Document> cardapios = database.getCollection("cardapios");
		Document cardapio = cardapios.find().first();
		System.out.println(cardapio);
	}

}
