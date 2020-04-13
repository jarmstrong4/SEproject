package twixt;

import java.io.IOException;

public class ServerInterface
{
  private Server server;

  public ServerInterface()
  {
    //Create a Server Example
    server = new Server();
    
    try
    {
      
      server.setPort(8300);
      server.setTimeout(500);
      server.listen();
      
    } catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
    
    
  }
  
  public static void main(String[] args)
  {
    new ServerInterface();
  }

}
