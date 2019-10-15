package com.register.login.registerandlogin.user.company.authorized.signer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignerRepository extends JpaRepository<AuthorizedSigner, Integer> {

}
