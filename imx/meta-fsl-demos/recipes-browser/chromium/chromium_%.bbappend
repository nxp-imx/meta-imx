export GYP_DEFINES="${ARMFPABI} release_extra_cflags='-Wno-error -Wno-error=deprecated-declarations -Wno-error=unused-local-typedefs' sysroot=''"

do_install_append_mx6 () {
    sed -i 's/$@/--use-gl=egl --ignore-gpu-blacklist --enable-accelerated-2d-canvas --gpu-no-context-lost $@/g' ${D}${bindir}/google-chrome
}
