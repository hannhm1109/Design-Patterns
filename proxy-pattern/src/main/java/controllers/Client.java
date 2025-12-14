package controllers;

import services.IService;

/**
 * @author hanane
 **/
public class Client {
    private IService service;
    public double perform(int temp){
        return service.compute(temp);
    }
    public void setService(IService service) {
        this.service = service;
    }
}
