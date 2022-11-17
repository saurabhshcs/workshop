package com.saurabhshcs.user.controller;

import com.saurabhshcs.user.domain.User;
import com.saurabhshcs.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest
{

    private static final String USER_HAS_BEEN_CREATED_SUCCESSFULLY = "User has been created successfully.";
    private static final String TEST_USER = "saurabh";
    private static final String TEST_USER_EMAIL = "saurabhshcs@gmail.com";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Mock
    private User user;

    @Test
    public void shouldCreateUserWhenUserDetailsProvided() throws Exception
    {
        user = User.builder()
                .name(TEST_USER)
                .email(TEST_USER_EMAIL)
                .build();
        when(userService.createUser(user)).thenReturn(USER_HAS_BEEN_CREATED_SUCCESSFULLY);
        mockMvc.perform(post("/createUser"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().string(USER_HAS_BEEN_CREATED_SUCCESSFULLY));
    }
}
