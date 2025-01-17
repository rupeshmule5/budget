package com.assessment.budget.repository;

import com.assessment.budget.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface BudgetRepository extends JpaRepository<Budget, Long> {
    }

