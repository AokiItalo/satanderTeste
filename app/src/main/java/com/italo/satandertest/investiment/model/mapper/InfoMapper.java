package com.italo.satandertest.investiment.model.mapper;

import com.italo.satandertest.investiment.model.Info;
import com.italo.satandertest.networking.webservices.investiment.InfoResponse;
import com.italo.satandertest.networking.webservices.investiment.ScreenResponse;

import java.util.ArrayList;
import java.util.List;


public class InfoMapper {

    public List<Info> mapInfoList(ScreenResponse screen) {
        ArrayList<Info> infos = new ArrayList<>();
        for (InfoResponse info : screen.getInfo()) {
            infos.add(new Info(info.getName(), info.getData()));
        }
        return infos;
    }

    public List<Info> mapDowInfoList(ScreenResponse screen) {
        ArrayList<Info> infos = new ArrayList<>();
        for (InfoResponse info : screen.getDownInfo()) {
            infos.add(new Info(info.getName(), info.getData()));
        }
        return infos;
    }
}
