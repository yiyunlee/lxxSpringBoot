package com.tim.lesson008;

import org.springframework.data.jpa.repository.JpaRepository;

/**
  * 注意！！！自己的接口是【继承】JpaRepository接口，而非【实现】JpaRepository
 * @author yiyunLee
 *
 */
public interface CatRepository extends JpaRepository<CatVO, Long>{

}
