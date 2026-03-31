# Qt installs native tools to /usr/libexec, but this is not in PATH
PATH:prepend = "${@bb.utils.contains('DISTRO_FEATURES', 'qt', '${STAGING_LIBEXECDIR_NATIVE}:', '', d)}"

