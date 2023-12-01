package com.dev.springbootplayground.mapper;

import com.dev.springbootplayground.entity.UserEntity;
import com.dev.springbootplayground.request.UserRequest;
import com.dev.springbootplayground.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity userRequestToUserEntity(UserRequest userRequest);

    UserResponse userEntityToUserResponse(UserEntity userEntity);

}
