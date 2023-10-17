package com.example.icici.lombard;

import com.example.icici.lombard.controller.BookController;
import com.example.icici.lombard.controller.TWProposalController;
import com.example.icici.lombard.dto.proposal.request.TwNBProposalAddons;
import com.example.icici.lombard.dto.proposal.request.TwProposalRequest;
import com.example.icici.lombard.dto.proposal.response.TwProposalResponse;
import com.example.icici.lombard.service.proposal.TWProposalService;
import com.example.icici.lombard.service.proposal.TwNBProposalAddonsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class IciciLombardApplicationTests {

    @Test
    void contextLoads() {
    }

    @InjectMocks
    private TWProposalController proposalController;
    @Mock
    private TWProposalService proposalService;
    @Mock
    private TwNBProposalAddonsService twNBProposalAddonsService;
    @InjectMocks
    private BookController bookController;

    @Mock
    private HttpServletRequest httpServletRequest;

    @Test
    public void testMapXmlToJson_Success() {
        String inputXml = "<example><title>Sample Book</title><author>Jane Doe</author></example>";
        ResponseEntity<String> response = bookController.mapXmlToJson(inputXml);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Processed JSON"));
    }

    @Test
    public void testMapXmlToJson_Failure() {
        String invalidXml = "<invalid-xml>";
        ResponseEntity<String> response = bookController.mapXmlToJson(invalidXml);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertTrue(response.getBody().contains("Error converting XML to JSON"));
    }

    @Test
    public void testCalculateInsurance() throws Exception {
        TwProposalRequest request = new TwProposalRequest();
        TwProposalResponse expectedResponse = new TwProposalResponse();
        when(proposalService.calculateInsurance(any(TwProposalRequest.class))).thenReturn(expectedResponse);

        ResponseEntity<TwProposalResponse> responseEntity = proposalController.calculateInsurance(request);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResponse, responseEntity.getBody());
    }

    @Test
    public void testGetTwNBProposalAddons() throws Exception {
        TwNBProposalAddons expectedAddons = new TwNBProposalAddons(/* create expected addons */);

        when(twNBProposalAddonsService.getTwNBProposalAddons()).thenReturn(expectedAddons);

        ResponseEntity<TwNBProposalAddons> responseEntity = proposalController.getTwNBProposalAddons();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedAddons, responseEntity.getBody());
    }
}
