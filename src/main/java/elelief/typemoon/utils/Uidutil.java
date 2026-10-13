package elelief.typemoon.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Uidutil {

    // 存储同一毫秒内的序列号：key 是时间戳（毫秒），value 是该时间戳对应的自增序列号
    private static final ConcurrentHashMap<Long, AtomicInteger> SEQUENCE_MAP = new
            ConcurrentHashMap<>();

    public static String generateOrderedUid(LocalDateTime registerTime) {
        if (registerTime == null) {
            throw new IllegalArgumentException("注册时间不能为空");
        }

        // 1. 将注册时间转为毫秒级时间戳（时间越早，数值越小）
        long timestamp = registerTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        // 2. 获取同一毫秒内的序列号（解决并发重复）
        // 若当前时间戳首次出现，初始化序列号为0；否则自增
        AtomicInteger sequence = SEQUENCE_MAP.computeIfAbsent(timestamp, k -> new AtomicInteger(0));
        int seq = sequence.getAndIncrement();

        // 3. 序列号补3位（确保格式统一，如 0→000，1→001）
        String seqStr = String.format("%03d", seq);

        // 4. 拼接时间戳和序列号（最终 uid 为纯数字，无时间格式）
        return timestamp + seqStr;
    }
}
