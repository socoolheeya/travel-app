package com.socoolheeya.travel.domain.rds.main.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class BookingEnums {

    @Getter
    @AllArgsConstructor
    public enum Status {
        REQUESTED, CONFIRMED, CANCELLED
    }

    @Getter
    @AllArgsConstructor
    public enum PaymentType {
        CASH, VISA, APPLE_PAY, GOOGLE_PAY, NAVER_PAY, KAKAO_PAY
    }

    @Getter
    @AllArgsConstructor
    public enum Financial {
        KOREA("001", FinancialType.BANK, "한국은행"),
        KOREA_DEVELOPMENT("002", FinancialType.BANK, "산업은행"),
        IBK("003", FinancialType.BANK,  "기업은행"),
        KB("004", FinancialType.BANK,"국민은행"),
        SUHYUP("007", FinancialType.BANK, "수협은행"),
        NH("011", FinancialType.BANK, "농협은행"),
        WOORI("020", FinancialType.BANK, "농협은행"),
        SC_JAIL("023", FinancialType.BANK, "SC제일은행"),
        CITY("027", FinancialType.BANK, "씨티은행"),
        DAEGU("031", FinancialType.BANK, "대구은행"),
        BUSAN("032", FinancialType.BANK, "부산은행"),
        GWANGJU("034", FinancialType.BANK, "광주은행"),
        JEJU("035", FinancialType.BANK, "제주은행"),
        JEONBUK("037", FinancialType.BANK, "전북은행"),
        GYOUNGNAM("039", FinancialType.BANK, "경남은행"),
        HANA("081", FinancialType.BANK, "하나은행"),
        SHINHAN("089", FinancialType.BANK, "신한은행"),
        KBANK("090", FinancialType.BANK, "케이뱅크"),
        KAKAO("090", FinancialType.BANK, "카카오뱅크"),
        TOSS("090", FinancialType.BANK, "토스뱅크"),

        CENTRAL_SUHYUP("007", FinancialType.NON_BANKING, "수협중앙회"),
        CENTRAL_NONGHYUP("012", FinancialType.NON_BANKING, "농협중앙회"),
        SAEMAUL("045", FinancialType.NON_BANKING, "새마을금고중앙회"),
        CENTRAL_SHINHYUP("048", FinancialType.NON_BANKING, "신협중앙회"),
        SAVINGS_BANK("050", FinancialType.NON_BANKING, "저축은행중앙회"),
        CENTRAL_SANLIM("064", FinancialType.NON_BANKING, "산림조합중앙회"),
        POST_OFFICE("071", FinancialType.NON_BANKING, "우정사업본부"),

        MIRAE("218", FinancialType.INVESTMENT, "KB증권"),
        SAMSUNG("238", FinancialType.INVESTMENT, "미래에셋대우"),
        HANGOOK("243", FinancialType.INVESTMENT, "삼성증권"),
        NH_INVESTMENT("247", FinancialType.INVESTMENT, "NH투자증권"),
        GYOBO("261", FinancialType.INVESTMENT, "교보증권"),
        DGB("263", FinancialType.INVESTMENT, "하이투자증권"),
        HYUNDAI_MOTOR("265", FinancialType.INVESTMENT, "현대차증권"),
        KIWOOM("266", FinancialType.INVESTMENT, "키움증권"),
        EBEST("267", FinancialType.INVESTMENT, "이베스트투자증권"),
        SK("267", FinancialType.INVESTMENT, "SK증권"),
        DAISHIN("267", FinancialType.INVESTMENT, "대신증권"),
        HANWHA_INVESTMENT("267", FinancialType.INVESTMENT, "한화투자증권"),
        TOSS_INVESTMENT("267", FinancialType.INVESTMENT, "토스증권"),
        SHINHAN_INVESTMENT("267", FinancialType.INVESTMENT, "신한금융증권"),
        DB("267", FinancialType.INVESTMENT, "DB금융투자증권"),
        EUGENE("267", FinancialType.INVESTMENT, "유진투자증권"),
        MERITZ("267", FinancialType.INVESTMENT, "메리츠증권");


        private final String code;
        private final FinancialType financialType;
        private final String description;
    }

    @Getter
    public enum FinancialType {
        BANK, NON_BANKING, INVESTMENT
    }

    @Getter
    public enum FaxStatus {
        CONFIRMED, CANCELLED
    }

    @Getter
    public enum Gender {
        MALE, FEMALE
    }


}
