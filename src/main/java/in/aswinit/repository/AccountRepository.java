package in.aswinit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aswinit.entity.Account;
import in.aswinit.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account,AccountPK>{

}
