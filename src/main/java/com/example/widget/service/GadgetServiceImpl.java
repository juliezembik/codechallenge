package com.example.widget.service;

import com.example.widget.domain.GadgetEntity;
import com.example.widget.dto.CreateGadgetRequest;
import com.example.widget.dto.GadgetResponse;
import com.example.widget.repository.GadgetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GadgetServiceImpl implements GadgetService {
    private GadgetRepository gadgetRepository;

    public GadgetServiceImpl(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }


}
