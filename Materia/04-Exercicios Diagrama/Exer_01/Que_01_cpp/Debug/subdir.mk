################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../Cliente.cpp \
../Funcionario.cpp \
../OrdemServico.cpp \
../Pessoa.cpp \
../Servico.cpp \
../Veiculo.cpp \
../main.cpp 

OBJS += \
./Cliente.o \
./Funcionario.o \
./OrdemServico.o \
./Pessoa.o \
./Servico.o \
./Veiculo.o \
./main.o 

CPP_DEPS += \
./Cliente.d \
./Funcionario.d \
./OrdemServico.d \
./Pessoa.d \
./Servico.d \
./Veiculo.d \
./main.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


