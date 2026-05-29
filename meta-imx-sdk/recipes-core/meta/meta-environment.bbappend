toolchain_create_sdk_env_script:append() {
    # Add export HOSTPKG_CONFIG for kernel build
    cat >> $script <<'EOF'
    export MAKEFLAGS="${MAKEFLAGS:+$MAKEFLAGS }HOSTPKG_CONFIG=$OECORE_NATIVE_SYSROOT/usr/bin/pkg-config-native"
EOF
}

