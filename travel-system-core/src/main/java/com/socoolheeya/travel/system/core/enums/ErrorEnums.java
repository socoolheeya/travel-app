package com.socoolheeya.travel.system.core.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorEnums {
    /**
     * 60xx 시설 조회
     */
    NOT_FOUND_PROPERTY(6001, HttpStatus.BAD_REQUEST, "숙소를 찾을 수 없습니다"),


    /**
     * 61xx 시설 저장
     */
    NOT_FOUND_ADDRESS(6101, HttpStatus.BAD_REQUEST, "주소의 검색 결과가 없습니다"),
    FAILED_SYNC_PROPERTY(6102, HttpStatus.INTERNAL_SERVER_ERROR, "숙소 동기화 실패하였습니다"),
    FAILED_SAVING_PROPERTY(6102, HttpStatus.INTERNAL_SERVER_ERROR, "숙소 저장 실패하였습니다"),

    /**
     *  70xx 객실 조회
     */
    NOT_FOUND_ROOM(7001, HttpStatus.BAD_REQUEST, "객실을 찾을 수 없습니다"),

    /**
     *  71xx 객실 저장
     */
    FAILED_SAVING_ROOM(7101, HttpStatus.BAD_REQUEST, "객실 저장 실패하였습니다"),

    /**
     *  80xx 요금제 조회
     */
    NOT_FOUND_RATE_PLAN(8001, HttpStatus.BAD_REQUEST, "요금제를 찾을 수 없습니다"),

    /**
     *  81xx 요금제 저장
     */
    FAILED_SAVING_RATE_PLAN(8101, HttpStatus.INTERNAL_SERVER_ERROR, "요금제 저장 오류"),

    /**
     *  90xx 요금 조회
     */
    NOT_FOUND_RATE(9000, HttpStatus.BAD_REQUEST, "요금을 찾을 수 없습니다"),

    /**
     * 100xx 예약 조회
     */
    INVALID_CHECKIN(10000, HttpStatus.BAD_REQUEST, "체크인 날짜가 오늘보다 커야 합니다"),
    INVALID_STAYS(10001, HttpStatus.BAD_REQUEST, "박수 조건은 15일 보다 작아야 합니다"),
    INVALID_ADULTS(10002, HttpStatus.BAD_REQUEST, "성인은 최소 1명 이상이어야 합니다"),
    NOT_FOUND_AVAILABILITY(10010, HttpStatus.BAD_REQUEST, "예약 조회 결과가 존재하지 않습니다"),


    /**
     * 101xx 예약 요청
     *
     */
    INVALID_RATE_PLAN(10100, HttpStatus.BAD_REQUEST, "요금제 정보가 변경되었습니다"),
    NOT_ALLOWED_CHILDREN(10101, HttpStatus.BAD_REQUEST, "어린이는 허용할 수 없습니다"),
    NOT_ENOUGH_BLOCK(10102, HttpStatus.BAD_REQUEST, "블럭이 부족합니다"),
    FAILED_CMS_BOOKING(10103, HttpStatus.INTERNAL_SERVER_ERROR, "CMS 예약이 실패하였습니다"),


    /**
     * 102xx 예약 취소
     */
    NOT_FOUND_CANCEL_POLICY(10200, HttpStatus.BAD_REQUEST, "취소 규정을 찾을 수 없습니다"),
    NOT_FOUND_BLOCK(10201, HttpStatus.BAD_REQUEST, "블럭을 찾을 수 없습니다"),

    /**
     * 400xx 권한
     */
    WRONG_KEY(40000, HttpStatus.UNAUTHORIZED, "만료되었거나 존재하지 않는 키입니다."),
    NO_AUTHORITY(40002, HttpStatus.UNAUTHORIZED, "권한이 없습니다"),
    INVALID_ACCESS_TOKEN(40001, HttpStatus.UNAUTHORIZED, "권한이 없습니다"),


    /**
     * 500xx 공통 서버 에러
     */
    SERVER_ERROR(5000, HttpStatus.INTERNAL_SERVER_ERROR, "처리 중 에러가 발생하였습니다"),
    REQUEST_TIMEOUT(5001, HttpStatus.REQUEST_TIMEOUT, "요청 시간이 초과하였습니다"),
    BAD_REQUEST(5002, HttpStatus.BAD_REQUEST, "잘못된 요청입니다"),
    PAYLOAD_TOO_LARGE(5003, HttpStatus.PAYLOAD_TOO_LARGE, "페이로드가 너무 큽니다"),
    FAILED_DECRYPT(5004, HttpStatus.INTERNAL_SERVER_ERROR, "복호화 실패하였습니다");


    private final Integer code;
    private final HttpStatus status;
    private final String message;

    ErrorEnums(Integer code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
