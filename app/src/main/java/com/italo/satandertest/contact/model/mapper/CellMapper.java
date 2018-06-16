package com.italo.satandertest.contact.model.mapper;

import com.italo.satandertest.contact.model.Cell;
import com.italo.satandertest.networking.webservices.contact.CellResponse;
import com.italo.satandertest.networking.webservices.contact.CellsResponse;

import java.util.ArrayList;
import java.util.List;


public class CellMapper {

    public List<Cell> mapList(CellsResponse cellsResponse){
        ArrayList<Cell> cells = new ArrayList<>();
        List<CellResponse> cellResponses = cellsResponse.getCells();
        for(CellResponse response: cellResponses){
            cells.add(new Cell(response.getMessage(), response.getType(),response.getTypeField(), response.isHidden(), (int) response.getTopSpacing(), response.isRequired()));
        }

        return cells;
    }


}
