package in.codingage.eatzy.service;

import in.codingage.eatzy.dto.AuthRequest;
import in.codingage.eatzy.dto.AuthResponse;

public interface AuthService {


    AuthResponse signup(AuthRequest request);
    AuthResponse login(AuthRequest request);

}
