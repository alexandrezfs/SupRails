SupRails
========

[J2EE | EJB | JPA] MSc 1. Course Labs 

##Requirements

+ Glassfish `3.1.2` (Open Source Edition is OK)
+ JDK `1.7.x`
+ IntellijIDEA `13.x`

##Installation

Simply import a new module into your intellijIDEA workspace as you would do for any other project.
See https://www.jetbrains.com/idea/documentation/ for more information.

IntellijIDEA should install every dependences needed, if not, set it yourself by adding the whole `lib/` folder to the module dependencies.

Make sure that your JDK is set to `1.7.x` when you import the module.

Once you imported it into IntellijIDEA, you have to :

+ Create an empty database
+ Make sure your have the `JDBC` driver `JAR` in the glassfish `lib` folder. Otherwise copy/paste the `JAR` into it
+ Create the Datasource Pool in Glassfish 3
+ Create the JDBC Resource in Glassfish 3, give it a `JNDI` name
+ In `src/META-INF/persistence.xml`, set up the right `JNDI` name for the data source you've just created
+ Create the artifact if it's not already done by IntellijIDEA
+ Setup the server, so add a new GF3 server. Associate the artifact to it, and make sure that GF3 is using JDK `1.7.x`
+ Set up the following `jars` from the `glassfish` folder as module dependencies :
  + `javax.jms.jar` from `modules` folder
  + `gf-client.jar` from `lib` folder


##Setting up the MetaModel API (Hibernate)

The MetaModel API generates classes for entities with `volatile` attributes in order to make easy to change an entity attribute.
Your are not required to enable it if you don't touch entities, but here are steps to enable it :

+ In `IntellijIDEA, go to file > settings` (`IntellijIDEA > preferences` on MAC OS X)
+ In the `compiler > Annotation Processors` section, select `suprails-web` module and check Enable annotation processing
+ Setup the generated paths to `generated` / `generated_tests`
+ Add a Processor FQ name and enter `org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor`
+ Click `Apply`, then `OK`


##JMS Listener + SOAP Services console usage

+ To launch the JMS Listener, run `JmsStarter`
+ To Try the SOAP Web services client on the console, run `ClientWebService`

##Contribution ?!
This project doesn't aim to be improved as this is just a course lab of SUPINFO International University.
In case you want to fork it, you can even if I don't know WTF why you'd do that.
