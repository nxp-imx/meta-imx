do_install[postfuncs] += "install_relative_symlinks"

python install_relative_symlinks () {
    basedir = d.getVar('D', True)
    """
    Walk basedir looking for absolute symlinks and replacing them with relative ones.
    The absolute links are assumed to be relative to basedir
    (compared to make_relative_symlink above which tries to compute common ancestors
    using pattern matching instead)
    """
    for walkroot, dirs, files in os.walk(basedir):
        for file in files + dirs:
            path = os.path.join(walkroot, file)
            if not os.path.islink(path):
                continue
            link = os.readlink(path)
            if not os.path.isabs(link):
                continue
            walkdir = os.path.dirname(path.rpartition(basedir)[2])
            base = os.path.relpath(link, walkdir)
            bb.debug(2, "Replacing absolute path %s with relative path %s" % (link, base))
            os.remove(path)
            os.symlink(base, path)
}
