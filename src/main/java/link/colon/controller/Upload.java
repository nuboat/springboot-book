package link.colon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequiredArgsConstructor
class Upload {

    @PostMapping(value = "/upload")
    private String post(@RequestParam("file") final MultipartFile file) {
        log.info("file {} size {}", file.getOriginalFilename(), file.getSize());
        return "OK";
    }

}
