package com.pws.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pws.admin.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer>{

}
