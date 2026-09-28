package day11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day11.model.dto.ApiDto;
import day11.model.entity.ApiEntity;
import day11.model.repository.ApiRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@Transactional
public class ApiService {
    @Autowired
    private ApiRepository apiRepository;

    public List<ApiDto> findAll() {
        List<ApiEntity> apiEntitiy = apiRepository.findAll();

        List<ApiDto> apiDtos = apiEntitiy.stream().map((entity) -> {
            return ApiDto.from(entity);
        }).toList();
        return apiDtos;
    }

    public boolean save(ApiDto apiDto) {
        ApiEntity apiEntity = apiDto.toEntity();
        ApiEntity saved = apiRepository.save(apiEntity);
        if (saved.getIdx() >= 1)
            return true;
        return false;
    }
}
