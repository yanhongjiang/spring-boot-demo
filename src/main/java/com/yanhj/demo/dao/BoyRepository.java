package com.yanhj.demo.dao;

import com.yanhj.demo.bean.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/10/15.
 */
public interface BoyRepository extends JpaRepository<Boy,Integer> {
}
