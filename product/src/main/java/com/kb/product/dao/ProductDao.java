package com.kb.product.dao;

import com.kb.product.util.DBUtil;
import com.kb.product.vo.Product;
import com.kb.product.vo.ProductDetail;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * TODO: 문제 5~8번 JDBC 기능을 구현하세요.
 */
public class ProductDao {
    public int insert(Product product) {
        // TODO 문제 5번 구현
        String sql = """
                INSERT INTO product
                    (product_name, category_id, price, stock, manufacturer, create_at)
                VALUES (?, ?, ?, ?, ?, ?)
                """;
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);
        ) {
            pstmt.setString(1, product.getProductName());
            pstmt.setInt(2, product.getCategoryId());
            pstmt.setInt(3, product.getPrice());
            pstmt.setInt(4, product.getStock());
            pstmt.setString(5, product.getManufacturer());
            pstmt.setDate(6, Date.valueOf(product.getCreatedAt()));

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

        return 0;
    }

    // TODO 문제 6번 구현
    public List<Product> selectList(int count) {
        List<Product> products = new ArrayList<>();
        String sql = """ 
                SELECT product_id,product_name,category_id,price,stock,manufacturer, create_at
                   FROM product ORDER BY price DESC  LIMIT ?
                """;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)
        ) {
            pstmt.setInt(1, count);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next())
                    products.add(mapProduct(rs));
            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return products;
    }

    // TODO 문제 7번 구현
    public Product selectOne(int productId) {
        String sql = """ 
                 SELECT product_id,product_name,category_id,price,stock,manufacturer, create_at
                FROM product WHERE  product_id = ?
                """;
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)
        ) {
            pstmt.setInt(1, productId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next())
                    return mapProduct(rs);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    // TODO 문제 8번 구현

    public ProductDetail getProductDetail(int productId) {
        String sql = """
                    SELECT p.product_id, p.product_name, p.category_id, c.category_name, p.price, p.stock, p.manufacturer, p.create_at 
                         FROM product p INNER JOIN category c ON p.category_id = c.category_id 
                            WHERE p.product_id = ?
                """;

        try (Connection connection = DBUtil.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, productId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) return mapProductDetail(rs);
            }
        } catch (SQLException e) {
            e.getMessage();
            //e.printStackTrace();
        }
        return null;
    }

    private Product mapProduct(ResultSet rs) throws SQLException {
        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setCategoryId(rs.getInt("category_id"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setManufacturer(rs.getString("manufacturer"));
        product.setCreatedAt(rs.getDate("create_at").toLocalDate());

        return product;
    }


    private ProductDetail mapProductDetail(ResultSet rs) throws SQLException {
        return ProductDetail.builder()
                .productId(rs.getInt("product_id"))
                .productName(rs.getString("product_name"))
                .categoryId(rs.getInt("category_id"))
                .categoryName(rs.getString("category_name"))
                .price(rs.getInt("price"))
                .stock(rs.getInt("stock"))
                .manufacturer(rs.getString("manufacturer"))
                .createdAt(rs.getDate("create_at").toLocalDate())
                .build();
    }
}
