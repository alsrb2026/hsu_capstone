package com.example.capstone.service;

import com.example.capstone.domain.Item;
import com.example.capstone.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = false)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    // 나중에는 currentBidId 까지 넘겨줘야 함. 낙찰한 사용자가 누군지 알 수 있게 하기 위해
    public void auctionItem(Long id, int winningBid, String status){
        Item item = itemRepository.findOne(id);
        item.setCurrentBid(winningBid);
        item.setStatus(status);
        itemRepository.save(item);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }
}
