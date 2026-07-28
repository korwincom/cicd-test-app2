package kr.co.wincom.cicdtestapp.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "CI/CD 테스트", description = "CI/CD 테스트")
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CicdTestController {

    @Operation(summary = "CI/CD 테스트", description = "CI/CD 테스트")
    @GetMapping("hello")
    public ResponseEntity<String> hello () {

        // 결과 출력
        log.info("Hello World!! from cicd-test-app2");
        return ResponseEntity.ok("Hello World!! from cicd-test-app2");
    }

}
