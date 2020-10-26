do_configure_append() {
    # generate scripts/module.lds for external module builds after kernel
    # commit: (596b0474 kbuild: preprocess module linker script)
    if ! [ -e ${STAGING_KERNEL_DIR}/arch/${ARCH}/kernel/module.lds ];then
      oe_runmake CC="${KERNEL_CC}" LD="${KERNEL_LD}" AR="${KERNEL_AR}" \
        -C ${STAGING_KERNEL_DIR} O=${STAGING_KERNEL_BUILDDIR} modules_prepare
    fi
}
