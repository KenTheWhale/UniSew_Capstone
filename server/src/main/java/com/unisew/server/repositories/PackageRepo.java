package com.unisew.server.repositories;

import com.unisew.server.models.Packages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepo extends JpaRepository<Packages, Integer> {
}
