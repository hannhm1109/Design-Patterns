package net.hanane;

import controllers.Client;
import proxy.ProxyCash;
import proxy.SecuredProxy;
import services.IService;
import services.ServiceImpl;

/**
 * @author hanane
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IService cash = new ProxyCash();
        var securedProxy = new SecuredProxy();
        securedProxy.setTarget(cash);
        securedProxy.setPassword("1234");
        Client client = new Client();
        client.setService(securedProxy);
        System.out.println("Res="+client.perform(23));
        System.out.println("Res="+client.perform(23));
        System.out.println("Res="+client.perform(25));
        System.out.println("Res="+client.perform(23));
    }
}