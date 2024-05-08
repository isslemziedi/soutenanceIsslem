package com.ufrcni.isslemproject.repository;

import com.ufrcni.isslemproject.models.PaymentHistory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentsHistoryRepository extends CrudRepository<PaymentHistory,Integer> {

    @Query(value = "SELECT * FROM v_payment_history WHERE user_id= :user_id",nativeQuery = true)
    List<PaymentHistory> getPaymentRecordsById(@Param("user_id")int user_id);


}
