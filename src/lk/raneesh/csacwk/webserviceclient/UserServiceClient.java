/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.raneesh.csacwk.webserviceclient;

/**
 *
 * @author Raneesh Gomez
 */
public class UserServiceClient {

    public static boolean register(java.lang.String nickname, java.lang.String username, java.lang.String password, java.lang.String confirmPassword) {
        lk.raneesh.csacwk.userservice.UserService_Service service = new lk.raneesh.csacwk.userservice.UserService_Service();
        lk.raneesh.csacwk.userservice.UserService port = service.getUserServicePort();
        return port.register(nickname, username, password, confirmPassword);
    }
    
}