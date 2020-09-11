package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.portal.dto.GoodsSaleOrderParam;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public interface PayService {

    public String alipay(GoodsSaleOrderParam input, HttpServletResponse response, HttpServletRequest request);

    public String getAlipayNotifyInfoOfCombinedPayment(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException;
}
