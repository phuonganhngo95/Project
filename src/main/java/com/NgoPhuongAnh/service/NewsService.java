package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.News;
import com.NgoPhuongAnh.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public Optional<News> findNewsById(Long id) {
        return newsRepository.findById(id);
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    public News updateNews(Long id, News newsDeTails) {
        News news = newsRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy tin tức với id: " + id));
        news.setName(newsDeTails.getName());
        news.setDescription(newsDeTails.getDescription());
        news.setImage(newsDeTails.getImage());
        news.setIdNewsCategory(newsDeTails.getIdNewsCategory());
        news.setContents(newsDeTails.getContents());
        news.setSlug(newsDeTails.getSlug());
        news.setMetaTitle(newsDeTails.getMetaTitle());
        news.setMetaKeyword(newsDeTails.getMetaKeyword());
        news.setMetaDescription(newsDeTails.getMetaDescription());
        news.setCreatedDate(newsDeTails.getCreatedDate());
        news.setUpdatedDate(newsDeTails.getUpdatedDate());
        news.setCreatedBy(newsDeTails.getCreatedBy());
        news.setUpdatedBy(newsDeTails.getUpdatedBy());
        news.setIsDelete(newsDeTails.getIsDelete());
        news.setIsActive(newsDeTails.getIsActive());

        return newsRepository.save(news);
    }

    public void deleteNews(Long id) {
        News news = newsRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy tin tức với id: " + id));
        newsRepository.delete(news);
    }

    public List<News> findNewsByName(String name) {
        return newsRepository.findByName(name);
    }
}
