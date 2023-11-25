# distributedproject

Client
  client.java
    this is the client interface java file, just add things that you think the client needs to have
    should start with a login screen to get the users u/s and p/w
      retrieve the accounttype of the account
    give user some actions that they can perform on that accounttype
      ie users can view files, admins can add/delete files, etc...
  serveractions.java
    this is just an interface with all the functions from the serveractions.java in the server
    nothing much to do here other than making sure its the exact same as the one in the server folder

Server
  account.java
    just a class impementation of the account
  accountType.java
    an account type implementations, could also be an enum in the account class if thats easier to implement
  itemfile.java
    this is the class implementation of the items that we store
      it has the variables to look up the items such as id, name, version, etc...
      also has implementation of methods to manipulate the item file
  mockdatabase.java
    this is the class that holds the items and accounts
      just implement a preset number of accounts and items
        we can add accounts in the demo, which will just be temporary as its not a real database
  server.java
    the server interface, nothing much to do here other than to initialize everything on the server side
  serveractions.java
    this is the interface that the client will have access to
      just make sure the file is the same as the one in the client folder
  serceractionsimpl.java
    this the implementation of the serveraction interface
      all the actions functions will be written here

