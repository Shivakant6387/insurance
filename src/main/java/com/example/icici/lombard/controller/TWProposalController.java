package com.example.icici.lombard.controller;
import com.example.icici.lombard.dto.proposal.request.TwNBProposalAddons;
import com.example.icici.lombard.dto.proposal.request.TwProposalRequest;
import com.example.icici.lombard.dto.proposal.response.TwProposalResponse;
import com.example.icici.lombard.service.proposal.TWProposalService;
import com.example.icici.lombard.service.proposal.TwNBProposalAddonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proposals")
public class TWProposalController {
    private final TWProposalService proposalService;
    private final TwNBProposalAddonsService twNBProposalAddonsService;

    @Autowired
    public TWProposalController(TWProposalService twProposalService, TwNBProposalAddonsService twNBProposalAddonsService) {
        this.proposalService = twProposalService;
        this.twNBProposalAddonsService = twNBProposalAddonsService;
    }
    @PostMapping("/getTwProposal")
    public ResponseEntity<TwProposalResponse> calculateInsurance(@RequestBody TwProposalRequest request) {
        TwProposalResponse response = proposalService.calculateInsurance(request);
        return ResponseEntity.ok(response);
    }
    @GetMapping
    public ResponseEntity<TwProposalRequest>get(TwProposalRequest request){
        TwProposalRequest requests=proposalService.getAll(request);
        return ResponseEntity.ok(requests);
    }
    @GetMapping("/getTwNBProposalAddons")
    public ResponseEntity<TwNBProposalAddons>getTwNBProposalAddons(){
        return ResponseEntity.ok(twNBProposalAddonsService.getTwNBProposalAddons());
    }
}
