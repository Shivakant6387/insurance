package com.example.icici.lombard.service.proposal;

import com.example.icici.lombard.dto.proposal.request.CustomerDetail;
import com.example.icici.lombard.dto.proposal.request.TwNBProposalAddons;
import org.springframework.stereotype.Service;

@Service
public class TwNBProposalAddonsService implements TwNBProposalAddonsServiceImp{
    @Override
    public TwNBProposalAddons getTwNBProposalAddons() {
        TwNBProposalAddons twNBProposalAddons=new TwNBProposalAddons();
        twNBProposalAddons.setCustomerDetail(new CustomerDetail());
        return twNBProposalAddons;
    }
}
