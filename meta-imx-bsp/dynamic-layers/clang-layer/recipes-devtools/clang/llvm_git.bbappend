# Reduce libllvm.so size by building only target architecture
LLVM_TARGETS_TO_BUILD:class-target = "${@get_clang_target_arch(bb, d)};BPF;${LLVM_TARGETS_GPU}"
LLVM_TARGETS_GPU:class-target = "${@bb.utils.contains_any('DISTRO_FEATURES', 'opencl opengl vulkan', 'SPIRV', '', d)}"
