package ru.atom.solid.lsp.violation;

/**
 * Данный класс нарушает LSP, т.к. при подстановке данного подкласса он сломает базовую логику работы всех подклассов.
 * Он бросает исключение, хотя все остальные так не делают. Он изменяет, а не расширяет базовый класс.
 */
public class WinampMediaPlayer extends MediaPlayer {
    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
