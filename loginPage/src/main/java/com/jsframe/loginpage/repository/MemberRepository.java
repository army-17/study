package com.jsframe.loginpage.repository;

import com.jsframe.loginpage.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
