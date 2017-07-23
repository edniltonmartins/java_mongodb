# java_mongodb
<h2>Tutorial de Java com MongoDB</h2>

<p>Antes de tudo baixe o mondodb clicando <a href="https://www.mongodb.com">aqui</a>. A documentação do MongoDB para quem quiser saber mais a respeito do banco está <a href="https://docs.mongodb.com">aqui</a>.

<h2>Primeiro passos</h2>

<h3>Criando seu Projeto Java</h3>
<ul>
  <li>Vá até File/New/Maven Project</li>
  <li>Depois Selecione "Create a Simple Project" para não usar arquetypes do maven</li>
  <li>Dê um nome no "Group Id" para o seu Projeto "normalmente colocamos a estrutura de pacotes como o domínio da empresa invertido, no meu caso usei it.edcompany"</li>
  <li>Dê um nome para do seu projeto no "Artifact Id" no meu caso usei PrjJavaMongo</li> 
</ul>

<h3>Iniciando o Servidor do MongoDB</h3>
<ul>
  <li>Abra o command, navegue até a pasta bin da instalação do seu mongodb. Provavelmente se seu SO for windows ela se encontrará em c:\Arquivos de Programas\MongoDB\3.4\bin</li>
  <li>Depois execute o mongodb --dbpath "digite o diretório onde deve ser armazenado o banco de dados"</li>
</ul>

<h3>Criando seu primeiro código de Exemplo</h3>
<ul>
  <li>Crie uma classe qualquer, no meu caso criei PrimeiroAcessoMongoDB.java</li>
  <li>Depois crie um metódo main e adicione o seguinte conteúdo:</br>
  <font color=blue>
  public static void main(String[] args){</br>
		&nbsp;&nbsp;MongoClient mongoClient = new MongoClient();</br>
		&nbsp;&nbsp;MongoDatabase database = mongoClient.getDatabase("cardapio");</br>
		&nbsp;&nbsp;MongoCollection<Document> cardapios = database.getCollection("cardapios");</br>
		&nbsp;&nbsp;Document cardapio = cardapios.find().first();</br>
		&nbsp;&nbsp;System.out.println(cardapio);</br>
		&nbsp;&nbsp;mongoClient.close();</br>
	}
  </font>
  
  </li>
</ul>

