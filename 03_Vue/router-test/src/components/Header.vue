<script></script>
<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark rounded">
    <div class="container-fluid">
      <RouterLink class="navbar-brand" to="/">이날치(LeeNalChi)</RouterLink>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#mainNavbar"
        aria-controls="mainNavbar"
        aria-expanded="false"
        aria-label="메뉴 열기"
      >
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="mainNavbar">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
          <RouterLink class="nav-link" to='/'>홈</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to='/about'>소개</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to='/members'>멤버</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to='/videos'>영상</RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
