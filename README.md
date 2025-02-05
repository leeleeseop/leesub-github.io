<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>이섭이 포트폴리오</title>
  <style>
    /* 간단 예시 CSS (원하는 대로 수정/추가 가능) */
    body {
      margin: 0;
      font-family: sans-serif;
      line-height: 1.6;
    }
    header, section {
      padding: 20px;
    }
    header {
      background: #f4f4f4;
    }
    h1, h2 {
      margin-top: 0;
    }
    .contact-info {
      margin-bottom: 0;
    }
    .contact-info p {
      margin: 0;
    }
    ul {
      margin: 0;
      padding-left: 20px;
    }
    li {
      margin-bottom: 4px;
    }
    details {
      margin-bottom: 10px;
    }
    details summary {
      font-weight: bold;
      cursor: pointer;
      outline: none;
    }
    /* 프로젝트 섹션 스타일 (예시) */
    .project-item {
      margin-bottom: 30px;
    }
    .project-item img {
      max-width: 300px;
      display: block;
      margin-bottom: 10px;
    }
    .project-item a {
      color: #333;
      text-decoration: none;
    }
    .project-item a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>

  <!-- 헤더 영역 -->
  <header>
    <h1>안녕하세요, 신입 개발자 이이섭입니다.</h1>
    <p>배우며 성장하고, 도움을 줄 수 있는 개발자가 되고 싶습니다.</p>
    <div class="contact-info">
      <p>| 경기도 의정부시 민락동</p>
      <p>| 010-2366-7237</p>
      <p>| aa990724@naver.com</p>
    </div>
  </header>

  <!-- 프로필 영역 -->
  <section id="profile">
    <h2>Profile</h2>
    <p><strong>경력 (총 1년 2개월)</strong></p>
    <p>동아기업 (2022.11 ~ 2023.02)</p>
    <ul>
      <li>그래픽 디자인 업무</li>
    </ul>
  </section>

  <!-- 스킬 영역 -->
  <section id="skills">
    <h2>Skills</h2>

    <!-- Hard Skills -->
    <h3>Hard Skills</h3>

    <details>
      <summary>SQL</summary>
      <ul>
        <li>CRUD(Create, Read, Update, Delete): 일반게시판, 공지사항, 메시지, 회원관리</li>
        <li>제약조건: primaryKey, not null, unique, foreign key, check</li>
        <li>DML: 데이터 (SELECT, INSERT, UPDATE, DELETE)</li>
        <li>DDL: 테이블 생성/삭제 (CREATE, ALTER, DROP)</li>
        <li>DCL: 권한관리 (GRANT, REVOKE)</li>
        <li>JOIN: 여러 테이블 간 데이터 결합 (INNER JOIN, OUTER JOIN 등)</li>
        <li>Subqueries: 서브쿼리를 활용한 복잡한 데이터 조회 (SELECT, WHERE, FROM)</li>
        <li>Transaction: (COMMIT, ROLLBACK)</li>
      </ul>
    </details>
    
    <details>
      <summary>Java</summary>
      <ul>
        <li>OOP(객체지향 프로그래밍)</li>
        <li>예외 처리</li>
        <li>Spring MVC: <strong>@Controller</strong>, <strong>@RestController</strong>, <strong>@RequestMapping</strong>, <strong>@GetMapping</strong>, <strong>@PostMapping</strong></li>
        <li>스프링 의존성 주입: <strong>@Autowired</strong>, <strong>@Component</strong>, <strong>@Service</strong>, <strong>@Repository</strong></li>
        <li>Servlets</li>
        <li>JSP</li>
      </ul>
    </details>

    <!-- Soft Skills -->
    <h3>Soft Skills</h3>
    <details>
      <summary>소프트 스킬</summary>
      <ul>
        <li>팀원 간 빠른 소통</li>
        <li>효율적인 시간관리</li>
      </ul>
    </details>

    <!-- 개발환경 -->
    <h3>개발환경</h3>
    <details>
      <summary>언어</summary>
      <ul>
        <li>Java</li>
        <li>HTML</li>
        <li>CSS</li>
        <li>JavaScript</li>
      </ul>
    </details>
    
    <details>
      <summary>IDE &amp; Tools</summary>
      <ul>
        <li>Eclipse</li>
        <li>STS</li>
        <li>Visual Studio Code</li>
        <li>GitHub</li>
        <li>ERwin</li>
      </ul>
    </details>
    
    <details>
      <summary>DB</summary>
      <ul>
        <li>Oracle
          <ul>
            <li>PL/SQL</li>
          </ul>
        </li>
      </ul>
    </details>
  
    <details>
      <summary>Libraries</summary>
      <ul>
        <li>Lombok</li>
        <li>jQuery</li>
        <li>MyBatis</li>
      </ul>
    </details>
  
    <details>
      <summary>Frameworks</summary>
      <ul>
        <li>Spring Framework</li>
      </ul>
    </details>
  </section>

  <!-- 프로젝트 영역 -->
  <section id="projects">
    <h2>Projects</h2>

    <div class="project-item">
      <h3>세덱스(SedEx) 팀 프로젝트</h3>
      <p>스포츠 용품 쇼핑 서비스</p>
      <!-- 링크와 이미지 경로는 실제 GitHub Pages 구조에 맞게 수정하세요 -->
      <a href="HTML/Project/SedEex/SedEex.html">
        <img src="image/projects/SedEx/backgroundSedEx.png" alt="SedEx 프로젝트">
      </a>
    </div>

    <div class="project-item">
      <h3>인터야드(interYard) 팀 프로젝트</h3>
      <p>온라인 종합 플랫폼</p>
      <a href="HTML/Project/interyard/interyard.html">
        <img src="image/projects/interYard/interYard사진.png" alt="interYard 프로젝트">
      </a>
    </div>

    <div class="project-item">
      <h3>비트마켓(Beetmarket) 팀 프로젝트</h3>
      <p>온라인 쇼핑 플랫폼</p>
      <a href="HTML/Project/Beetmarket/Beetmarket.html">
        <img src="image/projects/beetmarket/beetmarket사진.png" alt="Beetmarket 프로젝트">
      </a>
    </div>

  </section>

</body>
</html>
