/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;
import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author 10156
 */
public class DaoPedido extends BancoDeDadosMySql{
    private String sql;
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.ID = ?                          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNomePessoa(String nomePessoa){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   PES.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nomePessoa + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenomePessoa(String sobrenomePessoa){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   PES.SOBRENOME LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenomePessoa + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNomeProduto(String nomeProduto){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   PRO.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nomeProduto + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDataPedidoMaiorQue(String dataPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.DATA_PEDIDO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDataPedidoMenorQue(String dataPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.DATA_PEDIDO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDataPedidoIgualA(String dataPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.DATA_PEDIDO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTotalPedidoMaiorQue(Double totalPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.QUANTIDADE * PRO.PRECO > ?      " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, totalPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTotalPedidoMenorQue(Double totalPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.QUANTIDADE * PRO.PRECO < ?      " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, totalPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTotalPedidoIgualA(Double totalPedido){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PES.NOME AS PESSOA,               " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.DATA_PEDIDO AS DATA_PEDIDO,     " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                "   P.QUANTIDADE * PRO.PRECO AS TOTAL " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PESSOA PES ON                  " +
                "   PES.ID = C.ID_PESSOA              " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.QUANTIDADE * PRO.PRECO = ?      " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, totalPedido);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
