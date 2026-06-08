package com.kb.product.controller;

import com.kb.product.dao.ProductDao;
import com.kb.product.vo.Product;
import com.kb.product.vo.ProductDetail;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

/**
 * TODO: BufferedReader 기반 콘솔 UI를 완성하세요.
 */
public class Main {
    private final ProductDao productDao = new ProductDao();
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        while (true) {
            printMenu();
            System.out.print("메뉴 선택: ");
            String menu = br.readLine();
            switch (menu) {
                case "1" -> insertData();
                case "2" -> showList();
                case "3" -> showOne();
                case "4" -> showProductDetail();
                case "0" -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 메뉴입니다.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n==================================");
        System.out.println("상품관리 JDBC 모듈평가");
        System.out.println("==================================");
        System.out.println("1. 상품등록\n2. 상품목록\n3. 상품조회\n4. 상품상세조회\n0. 종료");
        System.out.println("==================================");
    }

    private void insertData() throws IOException {
        System.out.println("상춤명 : ");
        String name = br.readLine();

        System.out.println("카테고리 번호 : ");
        int categoryId = Integer.parseInt(br.readLine());

        System.out.println("가격 : ");
        int price = Integer.parseInt(br.readLine());

        System.out.println("재고 : ");
        int stock = Integer.parseInt(br.readLine());

        System.out.println("제조사 : ");
        String manufacturer = br.readLine();


        Product product = Product.builder()
                .productName(name)
                .categoryId(categoryId)
                .price(price)
                .stock(stock)
                .manufacturer(manufacturer)
                .createdAt(LocalDate.now())
                .build();

        System.out.println(productDao.insert(product) > 0 ? "상품 등록 완료" : "상품 등록 실패");
    }

    private void printProduct(Product p) {
        System.out.printf("%d \t %s \t %d \t %d \t %d \t %s \t %s%n"
                , p.getProductId()
                , p.getProductName()
                , p.getCategoryId()
                , p.getPrice()
                , p.getStock()
                , p.getManufacturer()
                , p.getCreatedAt()
        );
    }

    private void showList() throws IOException {
        System.out.print("조회할 상품 수를 입력해 주세요 : ");
        int count = Integer.parseInt(br.readLine());
        List<Product> products = productDao.selectList(count);
        System.out.println("번호 \t 상품명 \t 카테고리 \t 가격 \t 재고 \t 제조사 \t 등록일");
        for (Product p : products) printProduct(p);
    }

    private void showOne() throws IOException {
        System.out.print("조회할 상품 번호를 입력해 주세요! ");
        int id = Integer.parseInt(br.readLine());

        Product product = productDao.selectOne(id);
        if (product == null) {
            System.out.println("해당 상품이 없습니다.");
            return;
        }
        printProduct(product);
    }


    // TODO 문제 8번 구현
    private void showProductDetail() throws IOException {
        System.out.print("상세 조회할 상품 번호를 입력해 주세요! ");
        int id = Integer.parseInt(br.readLine());

        ProductDetail productDetail = productDao.getProductDetail(id);
        if (productDetail == null) {
            System.out.println("해당 상품이 없습니다.");
            return;
        }
        printProductDetail(productDetail);
    }

    private void printProductDetail(ProductDetail p) {
        System.out.println("번호 \t 상품명 \t 카테고리 \t 카테고리명\t 가격 \t 재고 \t 제조사 \t 등록일");
        System.out.printf("%d \t %s \t %d \t %s \t %d \t %d \t %s \t %s%n"
                , p.getProductId()
                , p.getProductName()
                , p.getCategoryId()
                , p.getCategoryName()
                , p.getPrice()
                , p.getStock()
                , p.getManufacturer()
                , p.getCreatedAt()
        );
    }
}

