package modeltest;

import model.AppModuleImpl;

import oracle.jbo.server.ApplicationModuleImpl;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class UnitTestFixture {
    private AppModuleImpl appModuleImpl;
    private ApplicationModule applicationModule;
    
    public UnitTestFixture() {}

    public void setUp() {
      String amDef = "br.com.waslleysouza.model.AppModule";
      String config = "AppModuleLocal";
     int n1 = 5;
    }
    
    public void tearDown() {
      int n2 = 10;
    }

    public AppModuleImpl getAppModuleImpl() {
      return appModuleImpl;
    }
    
}
