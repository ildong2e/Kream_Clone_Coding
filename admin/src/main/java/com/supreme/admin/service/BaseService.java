package com.supreme.admin.service;

import com.supreme.admin.ifs.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component  //자동주입?
public abstract class BaseService<Req,Res,Entity> implements CrudInterface<Req,Res> {
    // 빈 타입을 못찾거나 의존성 주입을 할 수 없는 경우 null 에러가 발생, optional로 설정->빈생성 무조건
    @Autowired(required = false)
    protected JpaRepository<Entity, Long> baseRepository;

}
