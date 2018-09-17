/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.angular.bean;

import com.osmadeit.angular.entities.Result;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author os
 */
@Stateless
public class ResultBean {
    @PersistenceContext
    EntityManager em;
    
    // get all results
    public List<Result> getResult(){
        TypedQuery<Result> typedQuery = em.createQuery("SELECT m FROM Result m", Result.class);
        List<Result> results =  typedQuery.getResultList();
        return results;
    }
   
    // get result by id
    public Result getResultById(int id){
        Result result = em.find(Result.class, id);
        return result;
    }
    
    // save result to db
    public Result createResult(Result result){
        em.persist(result);
        em.flush();
        return result;
    } 
    
    public Result updateResult(int id, Result resultNew) {
    Result result = em.find(Result.class, id);
    result.setMath(resultNew.getMath());
    em.persist(result);
    return result;
  }
    
    // delete result from DB
    public Result deleteResult(int id){
        Result result = em.find(Result.class, id);
        em.remove(result);
        return result;
    }
}
