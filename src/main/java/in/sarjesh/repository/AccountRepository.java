package in.sarjesh.repository;

import in.sarjesh.entity.Account;
import in.sarjesh.entity.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {
}
